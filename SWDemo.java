public class SWDemo
{
   public static void main(String[] args)
   {
      a();
   }

   public static void a()
   {
      b();
   }

   public static void b()
   {
      c();
   }

   public static void c()
   {
      StackWalker sw = StackWalker.getInstance();
      sw.forEach(System.out::println);
   }
}
