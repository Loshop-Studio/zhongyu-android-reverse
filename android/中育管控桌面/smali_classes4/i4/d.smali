.class public final synthetic Li4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/d;->a:Ljava/lang/String;

    iput-object p2, p0, Li4/d;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li4/d;->a:Ljava/lang/String;

    iget-object v1, p0, Li4/d;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Li4/e;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
