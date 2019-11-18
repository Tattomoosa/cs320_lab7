class IdExp extends Exp {
  private String id;
  IdExp(String id) {this.id = id;}

  void emit(Env<Integer> env, int depth) throws Env.UndefinedId {
      System.out.printf("DUP %d\n", depth - env.lookup(id));
  }

}

