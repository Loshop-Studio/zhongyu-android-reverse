.class public final Lz4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/mistake/activity/MainActivity;

.field public final b:Lcom/zykj/mistake/utils/g;

.field public final c:Lcom/zykj/view/utils/ImagePicker;

.field public final d:Ll4/d;

.field public final e:Landroidx/activity/result/ActivityResultLauncher;

.field public f:Landroidx/navigation/serialization/b;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MainActivity;Lcom/zykj/mistake/utils/g;Lcom/zykj/view/utils/ImagePicker;Ll4/d;Landroidx/activity/result/ActivityResultLauncher;)V
    .locals 1

    .line 1
    const-string v0, "galleryLauncher"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "imagePicker"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "editMistakeLauncher"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 20
    .line 21
    iput-object p2, p0, Lz4/e;->b:Lcom/zykj/mistake/utils/g;

    .line 22
    .line 23
    iput-object p3, p0, Lz4/e;->c:Lcom/zykj/view/utils/ImagePicker;

    .line 24
    .line 25
    iput-object p4, p0, Lz4/e;->d:Ll4/d;

    .line 26
    .line 27
    iput-object p5, p0, Lz4/e;->e:Landroidx/activity/result/ActivityResultLauncher;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Lz4/e;->f:Landroidx/navigation/serialization/b;

    .line 31
    .line 32
    return-void
.end method
