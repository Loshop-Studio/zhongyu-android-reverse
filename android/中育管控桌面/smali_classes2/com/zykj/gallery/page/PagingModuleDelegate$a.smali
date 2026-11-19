.class public final Lcom/zykj/gallery/page/PagingModuleDelegate$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/page/PagingModuleDelegate;-><init>(Le3/a;Ljava/lang/Object;ILkotlinx/coroutines/CoroutineScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/gallery/page/PagingModuleDelegate;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/zykj/gallery/page/PagingModuleDelegate;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/page/PagingModuleDelegate$a;->a:Lcom/zykj/gallery/page/PagingModuleDelegate;

    iput-object p2, p0, Lcom/zykj/gallery/page/PagingModuleDelegate$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/page/PagingModuleDelegate$a;->a:Lcom/zykj/gallery/page/PagingModuleDelegate;

    invoke-static {v0}, Lcom/zykj/gallery/page/PagingModuleDelegate;->b(Lcom/zykj/gallery/page/PagingModuleDelegate;)Le3/a;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/gallery/page/PagingModuleDelegate$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Le3/a;->create(Ljava/lang/Object;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/gallery/page/PagingModuleDelegate$a;->invoke()Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
