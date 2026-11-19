.class public interface abstract Lkotlin/coroutines/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/coroutines/c$a;,
        Lkotlin/coroutines/c$b;
    }
.end annotation


# static fields
.field public static final a0:Lkotlin/coroutines/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlin/coroutines/c$b;->c:Lkotlin/coroutines/c$b;

    sput-object v0, Lkotlin/coroutines/c;->a0:Lkotlin/coroutines/c$b;

    return-void
.end method


# virtual methods
.method public abstract interceptContinuation(Lvc/c;)Lvc/c;
.end method

.method public abstract releaseInterceptedContinuation(Lvc/c;)V
.end method
