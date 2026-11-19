.class public final Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;
.super Lcom/chad/library/adapter/base/BaseNodeAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter$a;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;->c:Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/cloudhelper/adapter/NoteStoreAdapter;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lra/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    sget v2, Lcom/zykj/cloudhelper/R$layout;->item_file:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lra/b;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->z(Lq1/a;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public u(Ljava/util/List;I)I
    .locals 0

    .line 1
    const-string p2, "data"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
