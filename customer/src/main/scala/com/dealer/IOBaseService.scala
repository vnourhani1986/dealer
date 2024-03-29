package com.dealer

import cats.effect.{Blocker, Concurrent, ExitCode, IO, IOApp}
//import com.dealer.infrastructure.client.ScraperNYTimesClients
//import com.dealer.infrastructure.endpoint.NewsEndpoint
//import com.dealer.infrastructure.repo.HeadlinePostgresRepo
//import com.dealer.service.{NewsRetrieveServiceImpl, ScraperNyTimesService}
//import org.http4s.implicits._
//import org.http4s.server.blaze.BlazeServerBuilder
//
//import java.util.concurrent.Executors
//import scala.concurrent.ExecutionContext

object IOBaseService extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = ???
//    for {
//      nonBlockingPool <- IO(Executors.newFixedThreadPool(4))
//      nonBlockingContext <- IO(ExecutionContext.fromExecutor(nonBlockingPool))
//      blockingPool <- IO(Executors.newFixedThreadPool(4))
//      blockingContext <- IO(Blocker.liftExecutorService(blockingPool))
//      loadedServiceConfig <- ServiceConfig.load[IO](blockingContext)
//      urlsConfig <- IO(loadedServiceConfig.client.api.urls)
//      scraperClients <- IO(ScraperNYTimesClients[IO](urlsConfig.nytimes))
//      headlinePostgresRepo <- IO(HeadlinePostgresRepo[IO])
//      _ <-
//        ScraperNyTimesService[IO](scraperClients, headlinePostgresRepo).scrape
//      newsRetrieveService <- IO(
//        NewsRetrieveServiceImpl[IO](headlinePostgresRepo)(
//          implicitly[Concurrent[IO]],
//          nonBlockingContext
//        )
//      )
//      newsEndpoint <- IO(
//        NewsEndpoint[IO](newsRetrieveService)(
//          implicitly[Concurrent[IO]],
//          nonBlockingContext
//        )
//      )
//      server <-
//        BlazeServerBuilder[IO](implicitly[ExecutionContext](nonBlockingContext))
//          .bindHttp(
//            loadedServiceConfig.host.port,
//            host = loadedServiceConfig.host.address
//          )
//          .withHttpApp(newsEndpoint.routes.orNotFound)
//          .serve
//          .compile
//          .lastOrError
//    } yield server

// todo: 2. writing some tests
// todo: 3. adding zio and monix data types
}
