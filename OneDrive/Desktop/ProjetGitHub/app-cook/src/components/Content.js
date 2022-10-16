import styles from "./Content.module.scss";

function Content(){
    return (
        <div className="flex-fill container">
            <h1>devouvrer nos nouvelles recettes</h1>
            <div className="card p-20">
                <div className={styles.grid}>
                    <div>ELEMENT</div>
                    <div>ELEMENT</div>
                    <div>ELEMENT</div>
                    <div>ELEMENT</div>
                    <div>ELEMENT</div>
                    <div>ELEMENT</div>
                </div>
            </div>
            
        </div>
    )
    
}

export default Content;