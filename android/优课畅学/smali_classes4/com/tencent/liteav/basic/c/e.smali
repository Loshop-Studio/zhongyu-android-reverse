.class public Lcom/tencent/liteav/basic/c/e;
.super Lcom/tencent/liteav/basic/util/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/basic/c/e$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/view/Surface;

.field public d:Z

.field public e:Lcom/tencent/liteav/basic/c/b;

.field public f:Landroid/opengl/EGLContext;

.field public g:Lcom/tencent/liteav/basic/c/a;

.field public h:Ljavax/microedition/khronos/egl/EGLContext;

.field private i:Lcom/tencent/liteav/basic/c/e$a;


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/util/d;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x2d0

    .line 5
    .line 6
    iput p1, p0, Lcom/tencent/liteav/basic/c/e;->a:I

    .line 7
    .line 8
    const/16 p1, 0x500

    .line 9
    .line 10
    iput p1, p0, Lcom/tencent/liteav/basic/c/e;->b:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->i:Lcom/tencent/liteav/basic/c/e$a;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/tencent/liteav/basic/c/e;->d:Z

    .line 19
    .line 20
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->e:Lcom/tencent/liteav/basic/c/b;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->f:Landroid/opengl/EGLContext;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->g:Lcom/tencent/liteav/basic/c/a;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->h:Ljavax/microedition/khronos/egl/EGLContext;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Landroid/os/Handler;Landroid/os/HandlerThread;)V
    .locals 2

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/16 v1, 0x65

    .line 2
    iput v1, v0, Landroid/os/Message;->what:I

    .line 3
    new-instance v1, Lcom/tencent/liteav/basic/c/e$1;

    invoke-direct {v1, p0, p1}, Lcom/tencent/liteav/basic/c/e$1;-><init>(Landroid/os/Handler;Landroid/os/HandlerThread;)V

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 4
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 1

    .line 7
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/liteav/basic/c/e;->c()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 8
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "surface-render: init egl context exception "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TXGLThreadHandler"

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/basic/c/e;->d()V

    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/tencent/liteav/basic/c/e;->i:Lcom/tencent/liteav/basic/c/e$a;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/tencent/liteav/basic/c/e$a;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    .line 3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onMsgRend Exception "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TXGLThreadHandler"

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private c()Z
    .locals 6

    .line 4
    iget v0, p0, Lcom/tencent/liteav/basic/c/e;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/tencent/liteav/basic/c/e;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "init egl size[%d/%d]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "TXGLThreadHandler"

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-boolean v0, p0, Lcom/tencent/liteav/basic/c/e;->d:Z

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->h:Ljavax/microedition/khronos/egl/EGLContext;

    iget-object v3, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    iget v4, p0, Lcom/tencent/liteav/basic/c/e;->a:I

    iget v5, p0, Lcom/tencent/liteav/basic/c/e;->b:I

    invoke-static {v2, v0, v3, v4, v5}, Lcom/tencent/liteav/basic/c/a;->a(Ljavax/microedition/khronos/egl/EGLConfig;Ljavax/microedition/khronos/egl/EGLContext;Landroid/view/Surface;II)Lcom/tencent/liteav/basic/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/basic/c/e;->g:Lcom/tencent/liteav/basic/c/a;

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->f:Landroid/opengl/EGLContext;

    iget-object v3, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    iget v4, p0, Lcom/tencent/liteav/basic/c/e;->a:I

    iget v5, p0, Lcom/tencent/liteav/basic/c/e;->b:I

    invoke-static {v2, v0, v3, v4, v5}, Lcom/tencent/liteav/basic/c/b;->a(Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;Landroid/view/Surface;II)Lcom/tencent/liteav/basic/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/basic/c/e;->e:Lcom/tencent/liteav/basic/c/b;

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->g:Lcom/tencent/liteav/basic/c/a;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->e:Lcom/tencent/liteav/basic/c/b;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "surface-render: create egl context "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->i:Lcom/tencent/liteav/basic/c/e$a;

    if-eqz v0, :cond_2

    .line 11
    invoke-interface {v0}, Lcom/tencent/liteav/basic/c/e$a;->c()V

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private d()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "surface-render: destroy egl context "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "TXGLThreadHandler"

    .line 21
    .line 22
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->i:Lcom/tencent/liteav/basic/c/e$a;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Lcom/tencent/liteav/basic/c/e$a;->e()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->g:Lcom/tencent/liteav/basic/c/a;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/a;->c()V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lcom/tencent/liteav/basic/c/e;->g:Lcom/tencent/liteav/basic/c/a;

    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->e:Lcom/tencent/liteav/basic/c/b;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/b;->c()V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lcom/tencent/liteav/basic/c/e;->e:Lcom/tencent/liteav/basic/c/b;

    .line 50
    .line 51
    :cond_2
    iput-object v1, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public a()Landroid/view/Surface;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->c:Landroid/view/Surface;

    return-object v0
.end method

.method public a(Lcom/tencent/liteav/basic/c/e$a;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/e;->i:Lcom/tencent/liteav/basic/c/e$a;

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->g:Lcom/tencent/liteav/basic/c/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/a;->a()Z

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/e;->e:Lcom/tencent/liteav/basic/c/b;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/c/b;->d()Z

    :cond_1
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/c/e;->c(Landroid/os/Message;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/c/e;->b(Landroid/os/Message;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/c/e;->a(Landroid/os/Message;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    check-cast p1, Ljava/lang/Runnable;

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_1
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
