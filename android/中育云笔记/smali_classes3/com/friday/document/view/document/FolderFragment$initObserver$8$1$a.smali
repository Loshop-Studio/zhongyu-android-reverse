.class public final Lcom/friday/document/view/document/FolderFragment$initObserver$8$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FolderFragment$initObserver$8$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/FolderFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/document/FolderFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$8$1$a;->c:Lcom/friday/document/view/document/FolderFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lqc/q;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p1, "FolderFragment.kt -> Fragment\u76d1\u542c\u5230\u7f13\u5b58\u6e05\u9664\u4fe1\u53f7\uff0c\u6267\u884c\u5237\u65b0"

    .line 2
    .line 3
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$8$1$a;->c:Lcom/friday/document/view/document/FolderFragment;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->y()V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 16
    .line 17
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqc/q;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$8$1$a;->b(Lqc/q;Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
