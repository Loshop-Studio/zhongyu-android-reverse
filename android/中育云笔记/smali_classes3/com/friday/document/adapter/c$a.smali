.class public final Lcom/friday/document/adapter/c$a;
.super Lcom/friday/document/adapter/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lcom/friday/document/adapter/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/document/adapter/c$a;

    invoke-direct {v0}, Lcom/friday/document/adapter/c$a;-><init>()V

    sput-object v0, Lcom/friday/document/adapter/c$a;->b:Lcom/friday/document/adapter/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1, v0}, Lcom/friday/document/adapter/c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
