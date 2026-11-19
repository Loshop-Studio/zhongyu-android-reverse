.class public final synthetic Lm7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:[Lkotlin/coroutines/d;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$IntRef;


# direct methods
.method public synthetic constructor <init>([Lkotlin/coroutines/d;Lkotlin/jvm/internal/Ref$IntRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/a;->a:[Lkotlin/coroutines/d;

    iput-object p2, p0, Lm7/a;->b:Lkotlin/jvm/internal/Ref$IntRef;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lm7/a;->a:[Lkotlin/coroutines/d;

    iget-object v1, p0, Lm7/a;->b:Lkotlin/jvm/internal/Ref$IntRef;

    check-cast p1, Lh7/p;

    check-cast p2, Lkotlin/coroutines/d$b;

    invoke-static {v0, v1, p1, p2}, Lkotlin/coroutines/CombinedContext;->i([Lkotlin/coroutines/d;Lkotlin/jvm/internal/Ref$IntRef;Lh7/p;Lkotlin/coroutines/d$b;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
