.class public Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/contextaware/OnContextAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;->L()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity$a;->a:Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;

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
    iget-object p1, p0, Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity$a;->a:Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/cloudhelper/activity/Hilt_NoteManagerActivity;->inject()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
