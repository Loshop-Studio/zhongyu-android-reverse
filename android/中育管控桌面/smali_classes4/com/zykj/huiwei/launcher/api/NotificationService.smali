.class public interface abstract Lcom/zykj/huiwei/launcher/api/NotificationService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00032\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/api/NotificationService;",
        "",
        "getMyUnreadMessageCount",
        "Lcom/zykj/http/bean/ApiResp;",
        "",
        "Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getMyMessageList",
        "Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;",
        "getMessageReq",
        "Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;",
        "(Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getNotice",
        "Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;",
        "id",
        "",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setMessageRead",
        "Ljava/lang/Void;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getMyMessageList(Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;
        .annotation runtime Lc6/a;
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "/api/services/app/Message/GetMyMessageListAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/MessageResp;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getMyUnreadMessageCount(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation runtime Lc6/f;
        value = "/api/services/app/Message/GetMyUnreadMessageCountAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/util/List<",
            "Lcom/zykj/huiwei/launcher/bean/resp/UnReadMessageBean;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getNotice(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lc6/t;
            value = "id"
        .end annotation
    .end param
    .annotation runtime Lc6/f;
        value = "/api/services/app/Notice/GetNoticeAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/zykj/huiwei/launcher/bean/resp/NoticeBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setMessageRead(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lc6/t;
            value = "messageId"
        .end annotation
    .end param
    .annotation runtime Lc6/o;
        value = "/api/services/app/Message/SetMessageReadAsync"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/http/bean/ApiResp<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
