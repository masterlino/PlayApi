package actions;

import controllers.TimeLogController;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

public class TimerLogAction extends Action<TimedLog> {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        long start = System.currentTimeMillis();

        CompletionStage<Result> ret = this.delegate.call(ctx);

        long end = System.currentTimeMillis();

        System.out.println(ctx.toString() + " in " + (end - start) + " ms");

        //creamos el log en la BD
        TimeLogController timeLogController = new TimeLogController();
        timeLogController.SetTimeLogStamp(start);
        timeLogController = null;

        return ret;
    }

}
