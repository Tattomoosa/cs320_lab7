class IdExp extends Exp {
    private String id;
  IdExp(String id) {this.id = id;}

  int eval(Env<Integer> env) throws Env.UndefinedId {
    // return env.lookup(id);
    System.out.printf("DUP %i\n", env.lookup(id));
  }
}

