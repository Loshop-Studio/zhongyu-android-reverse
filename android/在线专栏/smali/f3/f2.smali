.class final Lf3/f2;
.super Lf3/p1;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lf3/m1;)V
    .locals 0
    .param p1    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lf3/p1;-><init>(Lf3/m1;)V

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method
