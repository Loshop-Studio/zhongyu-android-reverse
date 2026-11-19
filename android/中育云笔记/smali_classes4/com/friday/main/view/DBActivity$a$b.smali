.class public final Lcom/friday/main/view/DBActivity$a$b;
.super Lcom/friday/main/view/DBActivity$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/main/view/DBActivity$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Lcom/friday/main/view/DBActivity$a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/main/view/DBActivity$a$b;

    invoke-direct {v0}, Lcom/friday/main/view/DBActivity$a$b;-><init>()V

    sput-object v0, Lcom/friday/main/view/DBActivity$a$b;->c:Lcom/friday/main/view/DBActivity$a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "Image"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "image"

    .line 5
    .line 6
    invoke-direct {p0, v2, v0, v1}, Lcom/friday/main/view/DBActivity$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/n;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
