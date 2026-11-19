.class public final La3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/e;


# static fields
.field public static final a:La3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La3/c;

    .line 2
    .line 3
    invoke-direct {v0}, La3/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La3/c;->a:La3/c;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const-class v0, Lcom/friday/lecture/floatwindow/FloatWindowService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const-class v0, Lcom/friday/lecture/floatwindow/StudentDemoService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    sget-object v0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld3/a;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Z)V
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/friday/lecture/floatwindow/options/a;->l(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    const-class v0, Lcom/friday/lecture/floatwindow/StudentDemoService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public f()V
    .locals 1

    .line 1
    const-class v0, Lcom/friday/lecture/floatwindow/StudentDemoService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->startService(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    sget-object v0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld3/a;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    sget-object v0, Ld3/a;->a:Ld3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld3/a;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
