class IdExp extends Exp {
  private String id;
  IdExp(String id) {this.id = id;}

  void emit(Env<Integer> env, int depth) throws Env.UndefinedId {
      int i = env.lookup(id);
      System.out.println("HERE");
      System.out.println(i);
  }

}

