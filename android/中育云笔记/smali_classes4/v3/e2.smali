.class public final synthetic Lv3/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/SearchActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/SearchActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/e2;->c:Lcom/friday/main/view/SearchActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/e2;->c:Lcom/friday/main/view/SearchActivity;

    check-cast p1, Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, p1}, Lcom/friday/main/view/SearchActivity;->U(Lcom/friday/main/view/SearchActivity;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
