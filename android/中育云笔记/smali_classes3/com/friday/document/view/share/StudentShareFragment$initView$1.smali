.class public final Lcom/friday/document/view/share/StudentShareFragment$initView$1;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/StudentShareFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/document/view/share/StudentShareFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/StudentShareFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/StudentShareFragment$initView$1;->a:Lcom/friday/document/view/share/StudentShareFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/document/view/share/StudentShareFragment$initView$1;->a:Lcom/friday/document/view/share/StudentShareFragment;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/friday/document/view/share/StudentShareFragment;->v(Lcom/friday/document/view/share/StudentShareFragment;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "null cannot be cast to non-null type com.friday.common.service.IShare"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Lj2/i;

    .line 20
    .line 21
    invoke-interface {p1}, Lj2/i;->l()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
