.class public final synthetic Lq5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function3;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/a;->a:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lq5/a;->b:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq5/a;->a:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Lq5/a;->b:Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1}, Lcom/zykj/evaluation/paging/SimplePagerKt;->a(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
