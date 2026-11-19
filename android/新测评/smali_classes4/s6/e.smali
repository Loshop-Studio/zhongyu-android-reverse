.class public final synthetic Ls6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/e;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Ls6/e;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/e;->a:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Ls6/e;->b:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/zykj/evaluation/ui/home/c;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/home/d;->b(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/home/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
