.class public abstract enum Lcom/zykj/message/client/MessageClient;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/message/client/MessageClient$INSTANCES;,
        Lcom/zykj/message/client/MessageClient$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/message/client/MessageClient;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\t\u0010\u0008J#\u0010\r\u001a\u00020\u00062\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\nH&\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00062\u0014\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00060\nH&\u00a2\u0006\u0004\u0008\u0016\u0010\u000eJ%\u0010\u0017\u001a\u00020\u00062\u0014\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00060\nH&\u00a2\u0006\u0004\u0008\u0017\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0018H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001aj\u0002\u0008\u0014\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/message/client/MessageClient;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Landroid/app/Application;",
        "context",
        "",
        "m",
        "(Landroid/app/Application;)V",
        "t",
        "Lkotlin/Function1;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "callBack",
        "k",
        "(Lkotlin/jvm/functions/Function1;)V",
        "j",
        "()Lcom/zykj/message/server/bean/UserInfo;",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "f",
        "",
        "a",
        "()Ljava/lang/String;",
        "r",
        "s",
        "",
        "q",
        "()Z",
        "o",
        "c",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/message/client/MessageClient;

.field public static final synthetic b:[Lcom/zykj/message/client/MessageClient;

.field public static final c:Lcom/zykj/message/client/MessageClient$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/zykj/message/client/MessageClient$INSTANCES;

    const-string v1, "INSTANCES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/zykj/message/client/MessageClient;

    aput-object v0, v1, v2

    sput-object v1, Lcom/zykj/message/client/MessageClient;->b:[Lcom/zykj/message/client/MessageClient;

    new-instance v0, Lcom/zykj/message/client/MessageClient$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/message/client/MessageClient$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/zykj/message/client/MessageClient;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/client/MessageClient;
    .locals 1

    const-class v0, Lcom/zykj/message/client/MessageClient;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/message/client/MessageClient;

    return-object p0
.end method

.method public static values()[Lcom/zykj/message/client/MessageClient;
    .locals 1

    sget-object v0, Lcom/zykj/message/client/MessageClient;->b:[Lcom/zykj/message/client/MessageClient;

    invoke-virtual {v0}, [Lcom/zykj/message/client/MessageClient;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/client/MessageClient;

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract f(Lkotlin/jvm/functions/Function1;)V
.end method

.method public abstract j()Lcom/zykj/message/server/bean/UserInfo;
.end method

.method public abstract k(Lkotlin/jvm/functions/Function1;)V
.end method

.method public abstract m(Landroid/app/Application;)V
.end method

.method public abstract o()Z
.end method

.method public abstract q()Z
.end method

.method public abstract r(Lkotlin/jvm/functions/Function1;)V
.end method

.method public abstract s(Lkotlin/jvm/functions/Function1;)V
.end method

.method public abstract t(Landroid/app/Application;)V
.end method
