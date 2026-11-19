.class public interface abstract Lq2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/e$b;,
        Lq2/e$a;
    }
.end annotation


# static fields
.field public static final R:Lq2/e$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lq2/e$b;->a:Lq2/e$b;

    sput-object v0, Lq2/e;->R:Lq2/e$b;

    return-void
.end method


# virtual methods
.method public abstract d(Lq2/d;)Lq2/d;
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq2/d<",
            "-TT;>;)",
            "Lq2/d<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract t(Lq2/d;)V
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "*>;)V"
        }
    .end annotation
.end method
