.class public Lcom/zykj/exception/GenericException;
.super Ljava/lang/Exception;
.source "GenericException.java"


# static fields
.field public static EXCEPTION_LEVEL_APP:I = 0x2

.field public static EXCEPTION_LEVEL_SYS:I = 0x1

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field errId:Ljava/lang/String;

.field errMsg:Ljava/lang/String;

.field errMsgOri:Ljava/lang/String;

.field errOri:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public getErrId()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/zykj/exception/GenericException;->errId:Ljava/lang/String;

    return-object v0
.end method

.method public getErrMsg()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/zykj/exception/GenericException;->errMsg:Ljava/lang/String;

    return-object v0
.end method

.method public getErrMsgOri()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/zykj/exception/GenericException;->errMsgOri:Ljava/lang/String;

    return-object v0
.end method

.method public getErrOri()Ljava/lang/Exception;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/zykj/exception/GenericException;->errOri:Ljava/lang/Exception;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/zykj/exception/GenericException;->errMsg:Ljava/lang/String;

    return-object v0
.end method

.method public setErrId(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/zykj/exception/GenericException;->errId:Ljava/lang/String;

    return-void
.end method

.method public setErrMsg(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/zykj/exception/GenericException;->errMsg:Ljava/lang/String;

    return-void
.end method

.method public setErrMsgOri(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/zykj/exception/GenericException;->errMsgOri:Ljava/lang/String;

    return-void
.end method

.method public setErrOri(Ljava/lang/Exception;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/zykj/exception/GenericException;->errOri:Ljava/lang/Exception;

    return-void
.end method

.method public writeLog(I)V
    .locals 1

    .line 27
    sget v0, Lcom/zykj/exception/GenericException;->EXCEPTION_LEVEL_SYS:I

    return-void
.end method
