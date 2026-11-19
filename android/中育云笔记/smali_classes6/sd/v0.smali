.class public final Lsd/v0;
.super Lsd/p1;
.source "SourceFile"


# instance fields
.field public final g:Lsd/t0;


# direct methods
.method public constructor <init>(Lsd/t0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsd/p1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsd/v0;->g:Lsd/t0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lsd/v0;->g:Lsd/t0;

    .line 2
    .line 3
    invoke-interface {p1}, Lsd/t0;->dispose()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
