package com.zykj.huiwei.launcher.api;

import com.zykj.http.bean.ApiResp;
import com.zykj.huiwei.launcher.bean.req.GetMessageReq;
import com.zykj.huiwei.launcher.bean.resp.MessageResp;
import com.zykj.huiwei.launcher.bean.resp.NoticeBean;
import com.zykj.huiwei.launcher.bean.resp.UnReadMessageBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4510a;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4529t;

@Metadata(m7879d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0013À\u0006\u0003"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/api/NotificationService;", "", "getMyUnreadMessageCount", "Lcom/zykj/http/bean/ApiResp;", "", "Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyMessageList", "Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;", "getMessageReq", "Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;", "(Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotice", "Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMessageRead", "Ljava/lang/Void;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface NotificationService {
    @InterfaceC4524o("/api/services/app/Message/GetMyMessageListAsync")
    Object getMyMessageList(@InterfaceC4510a GetMessageReq getMessageReq, Continuation<? super ApiResp<MessageResp>> continuation);

    @InterfaceC4515f("/api/services/app/Message/GetMyUnreadMessageCountAsync")
    Object getMyUnreadMessageCount(Continuation<? super ApiResp<List<UnReadMessageBean>>> continuation);

    @InterfaceC4515f("/api/services/app/Notice/GetNoticeAsync")
    Object getNotice(@InterfaceC4529t("id") long j6, Continuation<? super ApiResp<NoticeBean>> continuation);

    @InterfaceC4524o("/api/services/app/Message/SetMessageReadAsync")
    Object setMessageRead(@InterfaceC4529t("messageId") long j6, Continuation<? super ApiResp<Void>> continuation);
}
