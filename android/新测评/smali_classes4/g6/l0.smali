.class public final synthetic Lg6/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:Lcom/zykj/evaluation/ui/detail/c;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function2;Lcom/zykj/evaluation/ui/detail/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg6/l0;->a:Z

    iput-object p2, p0, Lg6/l0;->b:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, Lg6/l0;->c:Lcom/zykj/evaluation/ui/detail/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg6/l0;->a:Z

    iget-object v1, p0, Lg6/l0;->b:Lkotlin/jvm/functions/Function2;

    iget-object v2, p0, Lg6/l0;->c:Lcom/zykj/evaluation/ui/detail/c;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lg6/z0;->B(ZLkotlin/jvm/functions/Function2;Lcom/zykj/evaluation/ui/detail/c;Ljava/lang/String;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
