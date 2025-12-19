void pop(int *top){
    if(*top!=-1)
        *top=*top-1;
}
int isEmpty(int *top){
    if(*top==-1)
        return 1;
    else 
        return 0;
}
bool isValid(char* ch) {
    char st[strlen(ch)];
    int top=-1, flag=0;
    for(int i=0; i<strlen(ch); i++){
        if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{')
            st[++top]=ch[i];
        else if(ch[i]==')' || ch[i]==']' || ch[i]=='}'){
            if(isEmpty(&top)==1)
                flag=1;
            else if(ch[i]==')' && st[top]=='(')
                pop(&top);
            else if(ch[i]==']' && st[top]=='[')
                pop(&top);
            else if(ch[i]=='}' && st[top]=='{')
                pop(&top);
            else 
                flag=1;
        }
    }
    if(top!=-1 || flag==1)
        return false;
    else
        return true;
}