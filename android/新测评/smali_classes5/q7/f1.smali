.class public final synthetic Lq7/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/f1;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lq7/f1;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq7/f1;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq7/f1;->b:Lkotlin/jvm/functions/Function0;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment$c;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
