package com.xiaoqiang.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesForSets {
      static  <T> Set<T> fill(Set<T> set , Class<T> type)
      {
          try
          {
              for(int i=0;i<10;i++)
              {
                   set.add(type.getConstructor(int.class).newInstance(i));
              }
          }
          catch (Exception e)
          {
              throw  new RuntimeException();
          }
          return set;
      }
      static <T> void test(Set<T> set , Class<T> type)
          {
              fill(set,type);
              fill(set,type);
              fill(set,type);
              System.out.println(set);
          }

    public static void main(String[] args) {
        test(new HashSet<HashType>(),HashType.class);
        test(new LinkedHashSet<HashType>(),HashType.class);
        test(new TreeSet<TreeType>(),TreeType.class);
        test(new HashSet<SetType>(),SetType.class);
        test(new HashSet<TreeType>(),TreeType.class);
        test(new LinkedHashSet<SetType>(),SetType.class);
        test(new LinkedHashSet<TreeType>(),TreeType.class);

        try
        {
            test(new TreeSet<HashType>(),HashType.class);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }

}
