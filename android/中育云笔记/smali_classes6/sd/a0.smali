.class public final synthetic Lsd/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsd/a0;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-boolean p2, p0, Lsd/a0;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lsd/a0;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-boolean v1, p0, Lsd/a0;->d:Z

    check-cast p1, Lkotlin/coroutines/d;

    check-cast p2, Lkotlin/coroutines/d$b;

    invoke-static {v0, v1, p1, p2}, Lsd/c0;->a(Lkotlin/jvm/internal/Ref$ObjectRef;ZLkotlin/coroutines/d;Lkotlin/coroutines/d$b;)Lkotlin/coroutines/d;

    move-result-object p1

    return-object p1
.end method
