.class public abstract enum Lcom/zykj/message/server/MessageManage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/message/server/MessageManage$INSTANCES;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/message/server/MessageManage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zykj/message/server/MessageManage;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Lm4/c;",
        "T",
        "Landroid/content/Context;",
        "context",
        "Ljava/lang/Class;",
        "messageService",
        "",
        "a",
        "(Landroid/content/Context;Ljava/lang/Class;)V",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "serverInfo",
        "c",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V",
        "b",
        "(Landroid/content/Context;)V",
        "messageserver_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum a:Lcom/zykj/message/server/MessageManage;

.field public static final synthetic b:[Lcom/zykj/message/server/MessageManage;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/zykj/message/server/MessageManage$INSTANCES;

    const-string v1, "INSTANCES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/zykj/message/server/MessageManage$INSTANCES;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/zykj/message/server/MessageManage;->a:Lcom/zykj/message/server/MessageManage;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/zykj/message/server/MessageManage;

    aput-object v0, v1, v2

    sput-object v1, Lcom/zykj/message/server/MessageManage;->b:[Lcom/zykj/message/server/MessageManage;

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
    invoke-direct {p0, p1, p2}, Lcom/zykj/message/server/MessageManage;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/server/MessageManage;
    .locals 1

    const-class v0, Lcom/zykj/message/server/MessageManage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/message/server/MessageManage;

    return-object p0
.end method

.method public static values()[Lcom/zykj/message/server/MessageManage;
    .locals 1

    sget-object v0, Lcom/zykj/message/server/MessageManage;->b:[Lcom/zykj/message/server/MessageManage;

    invoke-virtual {v0}, [Lcom/zykj/message/server/MessageManage;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/server/MessageManage;

    return-object v0
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;Ljava/lang/Class;)V
.end method

.method public abstract b(Landroid/content/Context;)V
.end method

.method public abstract c(Lcom/zykj/message/server/bean/ServerInfo;)V
.end method
