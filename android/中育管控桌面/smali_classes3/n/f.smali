.class public final Ln/f;
.super Ln/r$a;
.source "SourceFile"


# instance fields
.field public final a:Lk/t;

.field public final b:Landroid/content/res/AssetFileDescriptor;


# direct methods
.method public constructor <init>(Lk/t;Landroid/content/res/AssetFileDescriptor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln/r$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln/f;->a:Lk/t;

    .line 5
    .line 6
    iput-object p2, p0, Ln/f;->b:Landroid/content/res/AssetFileDescriptor;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Landroid/content/res/AssetFileDescriptor;
    .locals 1

    .line 1
    iget-object v0, p0, Ln/f;->b:Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
