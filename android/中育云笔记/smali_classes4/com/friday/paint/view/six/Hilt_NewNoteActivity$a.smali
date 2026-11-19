.class public Lcom/friday/paint/view/six/Hilt_NewNoteActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/contextaware/OnContextAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/Hilt_NewNoteActivity;->L()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/paint/view/six/Hilt_NewNoteActivity;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/Hilt_NewNoteActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/Hilt_NewNoteActivity$a;->a:Lcom/friday/paint/view/six/Hilt_NewNoteActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onContextAvailable(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/friday/paint/view/six/Hilt_NewNoteActivity$a;->a:Lcom/friday/paint/view/six/Hilt_NewNoteActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/paint/view/six/Hilt_NewNoteActivity;->inject()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
