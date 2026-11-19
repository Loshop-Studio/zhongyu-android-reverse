.class public final Lf3/f;
.super Lf3/a1;
.source "SourceFile"


# instance fields
.field private final g:Ljava/lang/Thread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0
    .param p1    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lf3/a1;-><init>()V

    .line 2
    iput-object p1, p0, Lf3/f;->g:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected X()Ljava/lang/Thread;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lf3/f;->g:Ljava/lang/Thread;

    return-object v0
.end method
