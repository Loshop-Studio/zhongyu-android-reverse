.class public abstract Lw6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sput-object v0, Lw6/b;->a:[Ljava/lang/String;

    .line 5
    .line 6
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    .line 7
    .line 8
    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 9
    .line 10
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lw6/b;->b:[Ljava/lang/String;

    .line 15
    .line 16
    filled-new-array {v1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lw6/b;->c:[Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "android.permission.CAMERA"

    .line 23
    .line 24
    filled-new-array {v0}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lw6/b;->d:[Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method
