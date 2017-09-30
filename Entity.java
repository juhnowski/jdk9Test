
class Entity {

public void test0(){
    throw new RuntimeException("Entity test0 exception");
}

  public void test(){
    test9();
  }

  public void test9(){
    test8();
  }

  public void test8(){
    test7();
  }

  public void test7(){
    test6();
  }

  public void test6(){
    test5();
  }

  public void test5(){
    test4();
  }

  public void test4(){
    test3();
  }

  public void test3(){
    test2();
  }

  public void test2(){
    test1();
  }

  public void test1(){
    test0();
  }

  public static void main(String[] args) {
    Entity e = new Entity();
    e.test();
  }
}
