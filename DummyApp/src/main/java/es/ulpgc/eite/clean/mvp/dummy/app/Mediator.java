package es.ulpgc.eite.clean.mvp.dummy.app;

import es.ulpgc.eite.clean.mvp.dummy.bye.Bye;
import es.ulpgc.eite.clean.mvp.dummy.bye.ByePresenter;
import es.ulpgc.eite.clean.mvp.dummy.dummy.Dummy;
import es.ulpgc.eite.clean.mvp.dummy.hello.Hello;
import es.ulpgc.eite.clean.mvp.dummy.hello.HelloPresenter;

public interface Mediator {
  void startingDummyScreen(Dummy.ToDummy presenter);

  void startingHelloScreen(Hello.ToHello presenter);

  void startingByeScreen(Bye.ToBye presenter);
}
