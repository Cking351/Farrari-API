package com.king.ferrariapi;

import com.king.ferrariapi.models.Model;
import com.king.ferrariapi.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Transactional
@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    ModelService modelService;

    @Transactional
    @Override
    public void run(String[] args) throws Exception {
        // ALL CURRENT PRODUCTION MODELS
        Model superfast = new Model("Ferrari 812 Superfast", "2017-Current", 0L, "6.5L V12", "789 hp @ 8,500 rpm", "530 lb-ft @ 7,000 rpm", 2.8, 211, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/2019_Ferrari_812_Superfast_S-A_6.5.jpg/1024px-2019_Ferrari_812_Superfast_S-A_6.5.jpg");
        superfast = modelService.save(superfast);

        Model stradale = new Model("Ferrari SF90 Stradale",
                "2019-Current", 0L, "4.0L TT V8 + 3 electric",
                "989 hp (combined)", "590 lb-ft", 2.5,
                211, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/13/Red_2019_Ferrari_SF90_Stradale_%2848264238897%29_%28cropped%29.jpg/1920px-Red_2019_Ferrari_SF90_Stradale_%2848264238897%29_%28cropped%29.jpg");
        stradale = modelService.save(stradale);

        Model stradaleSpider = new Model("Ferrari SF90 Spider", "2021-Current",
                0L, "4.0L TT V8 + 3 electric", "989 hp (combined)", "590 lb-ft", 2.5, 211, "https://cdn.ferrari.com/cms/network/media/img/resize/5fa92764bd92fd1c7fc25e54-ferrari-sf90-spider-intro-desk-opt?width=1920&height=1600");
        stradaleSpider = modelService.save(stradaleSpider);

        Model portofinom = new Model("Ferrari Portofino M", "2021-Current",
                0L, "3.9L twin-turbo V8", "612 hp @ 7,500", "560 lb-ft @ 3,000",3.4, 199,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ferrari-portofino-m-101-1600272934.jpg?crop=0.8431044658666142xw:1xh;center,top&resize=980:*");
        portofinom = modelService.save(portofinom);

        Model tributo = new Model("Ferrari F8 Tributo", "2020-Current", 0L, "3.9L twin-turbo V8", "710 hp @ 8,000 rpm", "568 lb-ft @ 3250 rpm", 2.9, 211,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2020-ferrari-f8-spyder-112-1593551723.jpg?crop=0.744xw:0.558xh;0.155xw,0.262xh&resize=1200:*");
        tributo = modelService.save(tributo);

        Model tributospider = new Model("Ferrari F8 Spider", "2020-Current", 0L, "3.9L twin-turbo V8", "710 hp @ 8,000 rpm", "568 lb-ft @ 3250 rpm", 2.9, 211,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2020-ferrari-f8-spyder-112-1593551723.jpg?crop=0.744xw:0.558xh;0.155xw,0.262xh&resize=1200:*");
        tributospider = modelService.save(tributospider);

        Model roma = new Model("Ferrari Roma", "2019-Current", 0L, "3.9 twin-turbo V8", "612 hp @ 7,500 rpm",
                "560 lb-ft @ 3000 rpm", 3.4, 199,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/2021_Ferrari_Roma_Front.jpg/1920px-2021_Ferrari_Roma_Front.jpg");
        roma = modelService.save(roma);

        Model eighttwelvegts = new Model("Ferrari 812 GTS", "2021-Current", 0L, "6.2L naturally aspirated V12", "789 hp @ 8,900 rpm",
                "530 lb-ft @ 7,000 rpm", 2.9, 210,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2021-ferrari-812-gts-120-1617299998.jpg?crop=0.881xw:0.661xh;0.0272xw,0.250xh&resize=980:*");
        eighttwelvegts = modelService.save(eighttwelvegts);

        Model monzasp = new Model("Ferrari Monza SP1", "2019-Current", 499, "6.5L naturally aspirated V12", "799 hp @ 8,500 rpm",
                "530 lb-ft @ 7,000 rpm", 2.9, 186,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Ferrari_Monza_SP1%2C_Paris_Motor_Show_2018%2C_IMG_0643.jpg/800px-Ferrari_Monza_SP1%2C_Paris_Motor_Show_2018%2C_IMG_0643.jpg");

        monzasp = modelService.save(monzasp);

        Model monzasptwo = new Model("Ferrari Monza SP2", "2019-Current", 499, "6.5L naturally aspirated V12", "799 hp @ 8,500 rpm",
                "530 lb-ft @ 7,000 rpm", 2.9, 186,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/2019_Ferrari_Monza_SP2.jpg/1920px-2019_Ferrari_Monza_SP2.jpg");

        monzasptwo = modelService.save(monzasptwo);

        Model pista = new Model("Ferrari 488 Pista", "2018-Current", 3500, "3.9L twin-turbo V8", "711 hp @ 7,500 rpm", "568 lb-ft @ 5,500 rpm",
                2.85, 211,"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2019-ferrari-488-pista-125-1528476287.jpg?crop=0.651xw:0.597xh;0.264xw,0.403xh&resize=2048:*");
        pista = modelService.save(pista);

        Model pistaSpider = new Model("Ferrari 488 Pista Spider", "2018-Current", 3500, "3.9L twin-turbo V8", "711 hp @ 7,500 rpm", "568 lb-ft @ 5,500 rpm",
                2.85, 211, "https://www.topgear.com/sites/default/files/styles/fit_1960x1102/public/cars-car/carousel/2019/03/dsc01529.jpg?itok=-etIwyYp");
        pistaSpider = modelService.save(pistaSpider);


        // 1940'S TO 1970'S MODELS
        Model inter = new Model("Ferrari 166 Inter", "1948-1950", 38, "2.0L Colombo V12", "110 bhp @ 6,000 rpm", "96 lb-ft @ 6,000 rpm",
                10.0, 106, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Ferrari_166_Inter_Coup%C3%A9_Touring_1949.jpg/1280px-Ferrari_166_Inter_Coup%C3%A9_Touring_1949.jpg");
        inter = modelService.save(inter);

        Model newinter = new Model("Ferrari 195 Inter", "1950-1951", 28, "2.3L Colombo V12", "130 bhp @ 6,000 rpm", "114 lb-ft @ 5,000 rpm",
                10.0, 120, "https://upload.wikimedia.org/wikipedia/commons/5/57/1951_Ferrari_195_Inter_Ghia%2C_ex-Villoresi%2C_front_left.jpg");
        newinter = modelService.save(newinter);

        Model twotwelveinter = new Model("Ferrari 212 Inter", "1951-1952", 82, "2.6L Colombo V12", "150 bhp @ 6,500 rpm"
        , "152 lb-ft @ 5250 rpm", 10.5, 121, "https://upload.wikimedia.org/wikipedia/commons/0/06/1952_Ferrari_212_Export_Vignale_Cabriolet_%2819011674504%29.jpg");
        twotwelveinter = modelService.save(twotwelveinter);

        Model twotwelveexport = new Model("Ferrari 212 Export", "1951-1952", 27, "2.6L Colombo V12", "150 bhp @ 6,500 rpm"
                , "152 lb-ft @ 5250 rpm", 9.0, 115, "https://upload.wikimedia.org/wikipedia/commons/1/1e/R%C3%A9tromobile_2015_-_Ferrari_212_Touring_Barchetta_-_1952_-_003.jpg");
        twotwelveexport = modelService.save(twotwelveexport);

        
    }
}
