package be.belfius.start.service;

import be.belfius.start.config.ConfogenResource;
import be.belfius.start.config.DocumentType;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author tersc
 * first appearance on 01/03/2022
 */
@Slf4j
@Service
public class GeneratorService {
    public void receiveConfogen(ConfogenResource resource){
        log.debug("receiveConfogen." + resource.toString());
        JSONObject json2Send = new JSONObject();

        if (DocumentType.CHAS.equals(resource.getDocumentType())) {

        } else if (DocumentType.ISSU.equals(resource.getDocumentType())) {
//           less fields than CONF or FIXI

        log.debug("json2Send = createIssuJson(resource)");
    } else if (DocumentType.CONF.equals(resource.getDocumentType()) || DocumentType.FIXI.equals(resource.getDocumentType())) {
//
        log.debug("json2Send = createOtherJson(resource)");
    }
    log.debug("sendConfogen(json2Send)");
    }

}
