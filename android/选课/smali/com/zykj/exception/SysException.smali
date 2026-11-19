.class public Lcom/zykj/exception/SysException;
.super Lcom/zykj/exception/GenericException;
.source "SysException.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private trace:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/zykj/exception/GenericException;-><init>()V

    const-string v0, ""

    .line 11
    iput-object v0, p0, Lcom/zykj/exception/SysException;->trace:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 32
    invoke-direct {p0, p2}, Lcom/zykj/exception/GenericException;-><init>(Ljava/lang/Exception;)V

    const-string v0, ""

    .line 11
    iput-object v0, p0, Lcom/zykj/exception/SysException;->trace:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Lcom/zykj/exception/SysException;->errId:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lcom/zykj/exception/SysException;->errOri:Ljava/lang/Exception;

    .line 36
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 37
    new-instance p2, Ljava/io/PrintStream;

    invoke-direct {p2, p1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 38
    iget-object v0, p0, Lcom/zykj/exception/SysException;->errOri:Ljava/lang/Exception;

    invoke-virtual {v0, p2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintStream;)V

    .line 39
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/exception/SysException;->errMsgOri:Ljava/lang/String;

    .line 40
    invoke-direct {p0}, Lcom/zykj/exception/SysException;->writeSysException()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 19
    invoke-direct {p0, p3}, Lcom/zykj/exception/GenericException;-><init>(Ljava/lang/Exception;)V

    const-string v0, ""

    .line 11
    iput-object v0, p0, Lcom/zykj/exception/SysException;->trace:Ljava/lang/String;

    .line 20
    iput-object p1, p0, Lcom/zykj/exception/SysException;->errId:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/zykj/exception/SysException;->errMsg:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/zykj/exception/SysException;->errOri:Ljava/lang/Exception;

    .line 24
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 25
    new-instance p2, Ljava/io/PrintStream;

    invoke-direct {p2, p1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 26
    iget-object p3, p0, Lcom/zykj/exception/SysException;->errOri:Ljava/lang/Exception;

    invoke-virtual {p3, p2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintStream;)V

    .line 27
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/exception/SysException;->errMsgOri:Ljava/lang/String;

    .line 28
    invoke-direct {p0}, Lcom/zykj/exception/SysException;->writeSysException()V

    return-void
.end method

.method private writeSysException()V
    .locals 2

    .line 62
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 63
    new-instance v1, Ljava/io/PrintStream;

    invoke-direct {v1, v0}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 64
    iget-object v0, p0, Lcom/zykj/exception/SysException;->errOri:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintStream;)V

    return-void
.end method


# virtual methods
.method public appendMsg(Ljava/lang/String;)V
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/zykj/exception/SysException;->trace:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/exception/SysException;->trace:Ljava/lang/String;

    return-void
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/zykj/exception/SysException;->errMsg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/exception/SysException;->errMsgOri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTrace()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/zykj/exception/SysException;->trace:Ljava/lang/String;

    return-object v0
.end method

.method public printDebug()V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/zykj/exception/SysException;->errOri:Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method
