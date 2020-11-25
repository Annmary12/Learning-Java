package com.annmary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UrlLibrary implements Iterable<String> {
    List<String> urls = new LinkedList<>();

    private class UrlIterator implements Iterator<String>{
      private Integer index = 0;

      @Override
      public boolean hasNext() {
        return index < urls.size();
      }

      @Override
      public String next() {
        StringBuilder sb = new StringBuilder();

        try {
          URL url = new URL(urls.get(index));
          BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));

          String line = null;

          while ((line = bf.readLine()) != null){
            sb.append(line);
            sb.append("\n");
          }
        }catch (Exception e) {
          e.printStackTrace();
        }
        index++;
        return sb.toString();
      }

      @Override
      public void remove() {
        urls.remove(index);
      }
    }

    public UrlLibrary(){
      urls.add("https://www.udemy.com/");
      urls.add("https://github.com/");
      urls.add("https://www.youtube.com/");
    }

    @Override
    public Iterator<String> iterator() {
      return new UrlIterator();
    }

//  @Override
//  public Iterator<String> iterator() {
//    return urls.iterator();
//  }
}
