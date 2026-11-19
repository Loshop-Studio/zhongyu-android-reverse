.class public final synthetic Lo2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/c$b;


# instance fields
.field public final synthetic a:Lcom/friday/document/adapter/DocumentAdapter;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/adapter/DocumentAdapter;Ljava/util/List;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/e;->a:Lcom/friday/document/adapter/DocumentAdapter;

    iput-object p2, p0, Lo2/e;->b:Ljava/util/List;

    iput-object p3, p0, Lo2/e;->c:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final a(La8/c;La8/a;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lo2/e;->a:Lcom/friday/document/adapter/DocumentAdapter;

    iget-object v1, p0, Lo2/e;->b:Ljava/util/List;

    iget-object v2, p0, Lo2/e;->c:Lcom/friday/common/entity/FileEntity;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lcom/friday/document/adapter/DocumentAdapter;->e(Lcom/friday/document/adapter/DocumentAdapter;Ljava/util/List;Lcom/friday/common/entity/FileEntity;La8/c;La8/a;I)V

    return-void
.end method
