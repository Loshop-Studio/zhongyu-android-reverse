.class public final synthetic Ls6/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/g2;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ls6/g2;->b:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/g2;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ls6/g2;->b:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    invoke-static {v0, v1}, Lcom/zykj/student/dialogue/ui/home/HomeScreensKt;->f(Lkotlin/jvm/functions/Function1;Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
