.class public final synthetic Lo2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/c$b;


# instance fields
.field public final synthetic a:Lcom/friday/document/adapter/RecycleBinAdapter;

.field public final synthetic b:[Lcom/friday/document/adapter/c;

.field public final synthetic c:Lcom/friday/document/adapter/MultiModeFileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/adapter/RecycleBinAdapter;[Lcom/friday/document/adapter/c;Lcom/friday/document/adapter/MultiModeFileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/i;->a:Lcom/friday/document/adapter/RecycleBinAdapter;

    iput-object p2, p0, Lo2/i;->b:[Lcom/friday/document/adapter/c;

    iput-object p3, p0, Lo2/i;->c:Lcom/friday/document/adapter/MultiModeFileEntity;

    return-void
.end method


# virtual methods
.method public final a(La8/c;La8/a;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lo2/i;->a:Lcom/friday/document/adapter/RecycleBinAdapter;

    iget-object v1, p0, Lo2/i;->b:[Lcom/friday/document/adapter/c;

    iget-object v2, p0, Lo2/i;->c:Lcom/friday/document/adapter/MultiModeFileEntity;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lcom/friday/document/adapter/RecycleBinAdapter;->f(Lcom/friday/document/adapter/RecycleBinAdapter;[Lcom/friday/document/adapter/c;Lcom/friday/document/adapter/MultiModeFileEntity;La8/c;La8/a;I)V

    return-void
.end method
