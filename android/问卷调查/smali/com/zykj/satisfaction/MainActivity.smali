# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/satisfaction/MainActivity;
.super La/b/c/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/satisfaction/MainActivity$a;
    }
.end annotation


# static fields
.field public static volatile u:Z


# instance fields
.field public o:Lb/d/b/i/f;

.field public p:Lb/d/b/h/a;

.field public q:Lb/d/a/d/c/a;

.field public r:Lb/d/a/d/c/c;

.field public final s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, La/b/c/g;-><init>()V

    new-instance v0, Le/n;

    invoke-direct {v0}, Le/n;-><init>()V

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "elements"

    .line 1
    invoke-static {v0, v1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    new-instance v2, Ld/e/c;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Ld/e/c;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2
    iput-object v1, p0, Lcom/zykj/satisfaction/MainActivity;->s:Ljava/util/ArrayList;

    const-string v0, "zywj.mmteck.cn"

    const-string v1, "zyclsroom.mmteck.cn"

    const-string v2, "test-room.mmteck.cn"

    const-string v3, "test-wj.mmteck.cn"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ld/e/e;->d([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->t:Ljava/util/List;

    return-void
.end method

.method public static final v(Lcom/zykj/satisfaction/MainActivity;)V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->q:Lb/d/a/d/c/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v2, v1

    goto :goto_0

    .line 2
    :cond_0
    iget-object v2, v0, Lb/d/a/d/c/a;->c:Ljava/lang/String;

    :goto_0
    if-nez v2, :cond_1

    goto/16 :goto_10

    :cond_1
    if-nez v0, :cond_2

    move-object v3, v1

    goto :goto_1

    .line 3
    :cond_2
    iget-object v3, v0, Lb/d/a/d/c/a;->d:Ljava/lang/String;

    :goto_1
    if-nez v3, :cond_3

    goto/16 :goto_10

    .line 4
    :cond_3
    iget-object v4, p0, Lcom/zykj/satisfaction/MainActivity;->r:Lb/d/a/d/c/c;

    if-nez v4, :cond_4

    move-object v4, v1

    goto :goto_2

    .line 5
    :cond_4
    iget-object v4, v4, Lb/d/a/d/c/c;->c:Ljava/lang/String;

    :goto_2
    if-nez v4, :cond_5

    goto/16 :goto_10

    :cond_5
    if-nez v0, :cond_6

    goto :goto_3

    .line 6
    :cond_6
    iget-object v0, v0, Lb/d/a/d/c/a;->f:Ljava/lang/String;

    if-nez v0, :cond_7

    :goto_3
    const-string v0, ""

    .line 7
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v5, :cond_8

    move v5, v7

    goto :goto_4

    :cond_8
    move v5, v6

    :goto_4
    const/4 v8, 0x2

    if-eqz v5, :cond_18

    const-string v0, "dev"

    invoke-static {v4, v0}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v0, v7

    goto :goto_5

    :cond_9
    const-string v0, "test"

    invoke-static {v4, v0}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_5
    if-eqz v0, :cond_a

    const-string v0, "http://demo.exam.zykj.org/dev"

    goto/16 :goto_e

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "."

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v9

    const-string v10, "$this$split"

    .line 8
    invoke-static {v2, v10}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "delimiters"

    invoke-static {v9, v10}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v10, v9, v6

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_b

    move v11, v7

    goto :goto_6

    :cond_b
    move v11, v6

    :goto_6
    const/16 v12, 0xa

    const/4 v13, -0x1

    if-nez v11, :cond_e

    .line 9
    invoke-static {v2, v10, v6, v6}, Ld/i/g;->e(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    move-result v9

    if-eq v9, v13, :cond_d

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    move v12, v6

    :cond_c
    invoke-virtual {v2, v12, v9}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v12

    add-int/2addr v12, v9

    invoke-static {v2, v10, v12, v6}, Ld/i/g;->e(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    move-result v9

    if-ne v9, v13, :cond_c

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual {v2, v12, v9}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lb/c/a/a;->w(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    goto :goto_8

    :cond_e
    const-string v10, "$this$asList"

    .line 10
    invoke-static {v9, v10}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const-string v10, "ArraysUtilJVM.asList(this)"

    .line 12
    invoke-static {v9, v10}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v10, Ld/i/b;

    new-instance v11, Ld/i/h;

    invoke-direct {v11, v9, v6}, Ld/i/h;-><init>(Ljava/util/List;Z)V

    invoke-direct {v10, v2, v6, v6, v11}, Ld/i/b;-><init>(Ljava/lang/CharSequence;IILd/f/a/c;)V

    const-string v9, "$this$asIterable"

    .line 14
    invoke-static {v10, v9}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ld/h/b;

    invoke-direct {v9, v10}, Ld/h/b;-><init>(Ld/h/a;)V

    .line 15
    new-instance v11, Ljava/util/ArrayList;

    const-string v10, "$this$collectionSizeOrDefault"

    .line 16
    invoke-static {v9, v10}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v10, v9, Ljava/util/Collection;

    if-eqz v10, :cond_f

    move-object v10, v9

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v12

    .line 17
    :cond_f
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ld/h/b;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ld/g/c;

    const-string v12, "$this$substring"

    .line 18
    invoke-static {v2, v12}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "range"

    invoke-static {v10, v12}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget v12, v10, Ld/g/a;->b:I

    .line 20
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 21
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 22
    iget v10, v10, Ld/g/a;->c:I

    .line 23
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 24
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    add-int/2addr v10, v7

    invoke-virtual {v2, v12, v10}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    .line 25
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 26
    :cond_10
    :goto_8
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v10, v6

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const-string v14, "api"

    invoke-static {v12, v14, v6, v8}, Ld/i/g;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZI)Z

    move-result v12

    if-eqz v12, :cond_11

    goto :goto_a

    :cond_11
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_12
    move v10, v13

    :goto_a
    if-ne v10, v13, :cond_13

    move v10, v7

    :cond_13
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v9

    add-int/2addr v9, v13

    if-ltz v9, :cond_17

    move v12, v6

    :goto_b
    add-int/lit8 v13, v12, 0x1

    if-ne v12, v10, :cond_14

    const-string v14, "school"

    goto :goto_c

    :cond_14
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    :goto_c
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v14

    sub-int/2addr v14, v7

    if-eq v12, v14, :cond_15

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    if-le v13, v9, :cond_16

    goto :goto_d

    :cond_16
    move v12, v13

    goto :goto_b

    :cond_17
    :goto_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "StringBuilder().apply {\n                    val list = apiHost.split(\".\")\n                    var index = list.indexOfFirst { it.contains(\"api\") }\n                    if (index == -1) {\n                        index = 1\n                    }\n                    for (i in list.indices) {\n                        if (i == index) {\n                            append(\"school\")\n                        } else {\n                            append(list[i])\n                        }\n                        if (i != list.size - 1) {\n                            append(\".\")\n                        }\n                    }\n                }.toString()"

    invoke-static {v0, v5}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_18
    :goto_e
    const-string v5, "time="

    invoke-static {v5}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v7, "&apiHost="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&apiToken="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&schoolCode="

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2f

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "index.html"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3f

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x23

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "index/questionnaireQuery"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 27
    invoke-static {v3, v2, v6, v8}, Ld/i/g;->a(Ljava/lang/CharSequence;CZI)Z

    move-result v4

    const-string v5, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    const/4 v7, 0x6

    if-eqz v4, :cond_19

    invoke-static {v3, v2, v6, v6, v7}, Ld/i/g;->h(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    invoke-virtual {v3, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_f

    :cond_19
    move-object v2, v3

    :goto_f
    invoke-static {v2, v0, v6, v8}, Ld/i/g;->a(Ljava/lang/CharSequence;CZI)Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-static {v2, v0, v6, v6, v7}, Ld/i/g;->h(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    :cond_1a
    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->t:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->t:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1b
    iget-object p0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz p0, :cond_1c

    iget-object p0, p0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    invoke-virtual {p0, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_10
    return-void

    :cond_1c
    const-string p0, "binding"

    invoke-static {p0}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, La/k/b/p;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    # RE layout layout/activity_main (0x7f0c001c), APK res/layout/activity_main.xml
    const v0, 0x7f0c001c

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090257

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/webkit/WebView;

    if-eqz v3, :cond_c

    new-instance v0, Lb/d/b/h/a;

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct {v0, p1, v3}, Lb/d/b/h/a;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/webkit/WebView;)V

    const-string p1, "inflate(layoutInflater)"

    .line 3
    invoke-static {v0, p1}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    const-string p1, "binding"

    if-eqz v0, :cond_b

    .line 4
    iget-object v0, v0, Lb/d/b/h/a;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    invoke-virtual {p0, v0}, La/b/c/g;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    invoke-static {v3}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    sget-object v4, Lb/d/b/b;->b:Lb/d/b/b;

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz v0, :cond_8

    iget-object v0, v0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    new-instance v4, Lcom/zykj/satisfaction/MainActivity$a;

    invoke-direct {v4, p0}, Lcom/zykj/satisfaction/MainActivity$a;-><init>(Lcom/zykj/satisfaction/MainActivity;)V

    const-string v5, "JsToJava"

    invoke-virtual {v0, v4, v5}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz v0, :cond_7

    iget-object v0, v0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    new-instance v4, Lb/d/b/c;

    invoke-direct {v4, p0}, Lb/d/b/c;-><init>(Lcom/zykj/satisfaction/MainActivity;)V

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    new-instance v4, Lb/d/b/d;

    invoke-direct {v4}, Lb/d/b/d;-><init>()V

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->p:Lb/d/b/h/a;

    if-eqz v0, :cond_5

    iget-object p1, v0, Lb/d/b/h/a;->b:Landroid/webkit/WebView;

    new-instance v0, Lb/d/b/e;

    invoke-direct {v0, p0}, Lb/d/b/e;-><init>(Lcom/zykj/satisfaction/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/zykj/satisfaction/MainActivity;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v4, "mPermissions"

    invoke-static {v1, v4}, Ld/f/b/d;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-static {p0, v1}, La/h/c/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_4

    new-array v0, v2, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, [Ljava/lang/String;

    .line 8
    sget v0, La/h/b/b;->b:I

    array-length v0, p1

    move v1, v2

    :goto_1
    if-ge v1, v0, :cond_3

    aget-object v3, p1, v1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Permission request for permissions "

    invoke-static {v1}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not contain null or empty values"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {p0, p1, v2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 9
    :cond_4
    new-instance p1, Lb/d/b/i/f;

    invoke-direct {p1, p0}, Lb/d/b/i/f;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/zykj/satisfaction/MainActivity;->o:Lb/d/b/i/f;

    return-void

    .line 10
    :cond_5
    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    :cond_8
    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    :cond_9
    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    .line 11
    :cond_b
    invoke-static {p1}, Ld/f/b/d;->l(Ljava/lang/String;)V

    throw v1

    .line 12
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5

    const-string v0, "permissions"

    invoke-static {p2, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, La/k/b/p;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    if-nez p1, :cond_2

    array-length p1, p2

    const/4 v0, -0x1

    add-int/2addr p1, v0

    if-ltz p1, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    add-int/lit8 v3, v2, 0x1

    aget v4, p3, v2

    if-ne v4, v0, :cond_0

    const v2, 0x7f0f0069

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :cond_0
    aget-object v2, p2, v2

    const-string v4, "==>>success"

    invoke-static {v2, v4}, Ld/f/b/d;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "PermissionActivity"

    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    if-le v3, p1, :cond_1

    goto :goto_2

    :cond_1
    move v2, v3

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, La/k/b/p;->onResume()V

    sget-object v0, Lb/d/a/b/b;->b:Lb/d/a/b/b;

    new-instance v1, Lcom/zykj/satisfaction/MainActivity$b;

    invoke-direct {v1, p0}, Lcom/zykj/satisfaction/MainActivity$b;-><init>(Lcom/zykj/satisfaction/MainActivity;)V

    invoke-virtual {v0, v1}, Lb/d/a/b/b;->a(Ld/f/a/b;)V

    return-void
.end method
