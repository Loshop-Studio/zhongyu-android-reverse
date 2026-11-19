.class public final synthetic Ly6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lv6/z;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lv6/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/e;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ly6/e;->b:Lv6/z;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ly6/e;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ly6/e;->b:Lv6/z;

    invoke-static {v0, v1}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->k(Lkotlin/jvm/functions/Function1;Lv6/z;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
