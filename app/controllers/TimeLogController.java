package controllers;

import models.TimeLog;
import play.mvc.Controller;

public class TimeLogController extends Controller {

    //metodo para crear una entrada en la tabla de logs
    public void SetTimeLogStamp(long timeLogDate){
        TimeLog timeLog = new TimeLog();
        timeLog.setTimeStamp(timeLogDate);
        timeLog.save();
    }
}
