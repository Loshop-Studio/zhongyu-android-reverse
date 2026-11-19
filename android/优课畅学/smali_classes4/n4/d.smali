.class public final synthetic Ln4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/CatalogCompleteAdapter;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/d;->a:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    iput p2, p0, Ln4/d;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/d;->a:Lcom/zykj/study/adapter/CatalogCompleteAdapter;

    iget v1, p0, Ln4/d;->b:I

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->d(Lcom/zykj/study/adapter/CatalogCompleteAdapter;ILandroid/view/View;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
