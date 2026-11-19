.class public Lio/github/inflationx/calligraphy3/CalligraphyInterceptor;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final calligraphy:Lio/github/inflationx/calligraphy3/Calligraphy;


# direct methods
.method public constructor <init>(Lio/github/inflationx/calligraphy3/CalligraphyConfig;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/github/inflationx/calligraphy3/Calligraphy;

    invoke-direct {v0, p1}, Lio/github/inflationx/calligraphy3/Calligraphy;-><init>(Lio/github/inflationx/calligraphy3/CalligraphyConfig;)V

    iput-object v0, p0, Lio/github/inflationx/calligraphy3/CalligraphyInterceptor;->calligraphy:Lio/github/inflationx/calligraphy3/Calligraphy;

    return-void
.end method


# virtual methods
.method public intercept(Lc/a/a/a/c;)Lc/a/a/a/b;
    .locals 1

    invoke-interface {p1}, Lc/a/a/a/c;->a()Lc/a/a/a/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lc/a/a/a/c;->b(Lc/a/a/a/a;)Lc/a/a/a/b;

    const/4 p1, 0x0

    throw p1
.end method
