package com.star.app.manage.common;

import com.star.app.manage.forms.ClientUpdateForm;
import com.start.common.Result;
import org.springframework.web.bind.annotation.RequestBody;

public interface StarBaseAppController {
    /**
     * 客户端应用升级
     *
     * @param form
     * @return
     */
    Result updateClientDeviceApp(@RequestBody ClientUpdateForm form);
}
