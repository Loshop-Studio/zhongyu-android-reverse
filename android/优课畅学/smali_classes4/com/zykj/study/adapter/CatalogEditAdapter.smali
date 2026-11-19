.class public final Lcom/zykj/study/adapter/CatalogEditAdapter;
.super Lcom/chad/library/adapter/base/BaseNodeAdapter;
.source "SourceFile"

# interfaces
.implements Lt0/c;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/CatalogEditAdapter$a;,
        Lcom/zykj/study/adapter/CatalogEditAdapter$b;
    }
.end annotation


# static fields
.field public static final y:Lcom/zykj/study/adapter/CatalogEditAdapter$a;

.field public static final z:I


# instance fields
.field public final x:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/adapter/CatalogEditAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/CatalogEditAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/adapter/CatalogEditAdapter;->y:Lcom/zykj/study/adapter/CatalogEditAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/adapter/CatalogEditAdapter;->z:I

    return-void
.end method

.method public constructor <init>(Ljava/util/HashSet;Lcom/zykj/study/adapter/CatalogEditAdapter$b;Lx7/l;)V
    .locals 4

    .line 1
    const-string v0, "selectModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "addIconClickListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "openKnowLedge"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/n;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogEditAdapter;->x:Ljava/util/HashSet;

    .line 22
    .line 23
    new-instance v0, Lcom/zykj/study/adapter/a;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    sget v3, Lcom/zykj/study/R$layout;->item_chapter_edit:I

    .line 27
    .line 28
    invoke-direct {v0, v2, v3, p1, p2}, Lcom/zykj/study/adapter/a;-><init>(IILjava/util/HashSet;Lcom/zykj/study/adapter/CatalogEditAdapter$b;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->k0(Lu0/a;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lcom/zykj/study/adapter/b;

    .line 35
    .line 36
    sget v0, Lcom/zykj/study/R$layout;->item_knowledge_edit:I

    .line 37
    .line 38
    invoke-direct {p1, v1, v0, p2, p3}, Lcom/zykj/study/adapter/b;-><init>(IILcom/zykj/study/adapter/CatalogEditAdapter$b;Lx7/l;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->k0(Lu0/a;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public a(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lt0/a;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lt0/c;->a(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lt0/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public h0(Ljava/util/List;I)I
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string p2, "null cannot be cast to non-null type com.zykj.study.bean.course.CatalogBean"

    .line 11
    .line 12
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method
